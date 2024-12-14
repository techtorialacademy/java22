# `.gitignore` File
## What is `.gitignore`? 
* A `.gitignore` file is used in *Git* to specify which files and directories should be
ignored by Git when tracking changes. 
* Files listed in this file are not added to the stagin area, committed, or pushed to the
repository.
* Commonly used to exclude sensitive data, system files, or unnecessary files that do 
not need version control.

## How does `.gitignore` work?
1. **Location**: Place the `.gitignore` file in the root of your repository.
2. **Behavior**:
    * When you run `git add`, Git check the `.gitignore` file to determine which
    files to exclude.
    * Ignored files are not tracked in the repository.
3. **Effect**:
    * `.gitignore` applies only to files **that are not already tracked**. If a file
    is already tracked and later added to `.gitignore`, you must remove it from Git's
    tracking using:
    ```bash
    git rm --cached filename
    # To untrack the file
    ```
## What to put in `.gitignore`? 
### Common Examples
1. **System/Environment Files**
    * OS-specific files (e.g., .DS_Store, Thumbs.db)
    * IDE files (e.g., .idea, .vscode etc.)
    * Environment configuration files
2. **Build/Output Files**
    * Compiled code (e.g., .class, .pyc)
    * Build directories (e.g., dist/, build/)
3. **Logs & Temporary Files**
4. **Files that contains sensitive data**.

## Pattern Rules in `.gitignore` file
1. **Files Ending With Certain Extensions:**
    * Use `*` to represent any file name.
```.gitignore
*.log   # ignores all .log files.
*.class # ignores all files that has .class extension.
```
2. **Files Starting With Certain Words**
```.gitignore
temp*   # ignores all files that start with temp
local*  # ignores all the files that start with local
```
3. **Specific Directories**
```.gitignore
logs/   # ignores the logs directory
localFiles/  # ignores the localFiles directory.
```
4. **Exclude Files or Directories**
```.gitignore
*.log  # ignores all files that ends with .log
!important.log // But do not ignore important.log
```

    