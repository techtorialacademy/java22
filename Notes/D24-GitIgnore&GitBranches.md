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
# Managing Commits in Git for Java Projects

### **Key Commands for Commit Management**

1. **Check Status**
   ```bash
   git status
   ```
    - See what changes are staged, unstaged, or untracked.

2. **Add Changes**
   ```bash
   git add filename   # Add specific file
   git add -A         # Add all changes
   ```

3. **Commit Changes**
   ```bash
   git commit -m "Your commit message"
   ```

4. **View Commit History and Find Commit Hash**
   ```bash
   git log
   ```
    - Each commit has a unique hash (e.g., `abc1234`) displayed in the log output:
      ```
      commit abc1234
      Author: Your Name <email@example.com>
      Date:   Mon Dec 12 10:00:00 2024
 
          Your commit message here
      ```
    - For a compact view:
      ```bash
      git log --oneline
      ```
      Example output:
      ```
      abc1234 Add login feature
      def5678 Fix NullPointerException
      ```

5. **Undo Last Commit (Keep Changes Locally)**
   ```bash
   git reset --soft HEAD~1
   ```

6. **Undo Last Commit (Discard Changes)**
   ```bash
   git reset --hard HEAD~1
   ```

7. **Amend Last Commit**
   ```bash
   git commit --amend -m "Updated message"
   ```

8. **Revert a Commit**
   ```bash
   git revert <commit-hash>
   ```

9. **Interactive Rebase (Edit or Squash Commits)**
   ```bash
   git rebase -i HEAD~n
   ```

### **Best Practices for Java Projects**

- Commit often with meaningful messages, e.g., `"Fix NullPointerException in UserService"`.
- Use `.gitignore` to exclude unnecessary files like `target/` or `.class` files.
- Regularly check `git log` to keep track of your history.

# Creating & Working With Branches
* Branches are used in Git to isolate work in progress, experiment with new features, or make 
bug fixes without effecting the main project.
* Once a work is complete in a branch, it can be merged in to the main branch to include the updates.

## Steps to Create a Branch, Push Changes, and Merge into the Main Branch

1. **Check Your Current Branch**
    * Use `git branch` to see which branch you are currently on. The branch name with a `*` next to it 
    is yours.
2. **Create a New Branch**
    * `git branch branchName` to create a new branch in Git.
    * Example: `git branch feature_branch.`
3. **Switch to the New Branch**
   * Use `git checkout branchName` **OR** `git switch branchName` to move to another branch.
   * **Tip**: You can combine branch creation and switching by using `git branch checkout -b branchName`.
4. **Make Changes In The New Branch and Track Them**
5. **Commit Your Changes**
   * Finalize your changes with a commit message
   ```bash
   git commit -m "Describe your changes here"
   ```
6. Push the Branch to Remote
   * Link your local branch to the remote repository and push
   ```bash
   git push -u origin branchName
   ```
   * After the first push, subsequent pushes in the branch can be done with  `git push`
7. Merge the Branch into Main
   * Switch the Branch into main branch
   ```bash
   git switch main
   ```
   * Pull the latest changes(Get latest version from github remote repository to your local)
   ```bash
   git pull origin main
   # OR git pull for subsequent pulls
   ```
   * Merge the feature branch into the main branch
   ```bash
   git merge nameOfBranch 
   ```
8. **Push the Updated Main Branch**
```bash
git push
```
   
## Summary Branch Commands For Daily Use
1. Create and switch to a new branch
```bash
git checkout -b branchName
```
2. Merge into the main branch
```bash
git switch main
git pull 
git merge branchName
git push
```
3. Deleting the branch
```bash
git branch -d branchName
```
* After you merge your changes to main branch from another branch remove the branch
* Delete the same repository on the remote
```bash
git push origin --delete branchName
```

# Managing Git Environment
### **Git Configuration Levels**
- Git allow configuring setting at three levels:
  1. **Global Level**: Applies to all repositories for a user.
  2. **Local Level**: Applies to only specific repository
  3. **System Level**: Applies to all users on a machine. 

## Configure Git Globally
```bash
git config --global key value 
```
- **What are `key` and `value`?** 
   * `key`: The setting you want to configure such as email, username etc.
   * `value`: The value to assign to the key such as your email, your username etc. 
- **Example**
```bash
git config --global user.name "Your name"
git config --global user.email "Your Email"
```
- **What it does?**
   - Sets default user identity for all Git repositories on the machine.
   - Stored in the global configuration file, typically located at `~/.gitconfig`.

### Configuring Git Locally
- **Command**
```bash
git config --local key value
```
- **What it does?**
   * Overrides the global setting for the specific repository.

### Adding a remote repository
- **Command**
```bash
git remote add origin https://<PAT>@github.com/username/repo.git
```
- **What happens here?**
   * `git remote add`: Links your local repository to a remote repository.
   * `origin`: The name assigned to the remote.(default name is usually `origin`.)
   * `https://<PAT>@github.com/username/repo.git`: The URL of the remote repository, including the Personal Access 
   Token (PAT) for authentication.
  
### **Global vs Local Configuration**
- **Global Settings (`git config --global`)**:
   - Define user information or default behaviors across all repositories.
   - Stored in `~/.gitconfig`.

- **Local Settings (`git config --local`)**:
   - Apply only to the repository where they are set.
   - Stored in `.git/config` inside the repository.

- **Adding Remote (`git remote add`)**:
   - Not a configuration but a specific command to link the repository to a remote.
   - Uses the `https://PAT` format to include authentication for private repositories.
  