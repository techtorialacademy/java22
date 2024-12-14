## What is a Pull Request? 
* A pull request is a mechanism in Git-based platforms (like, GitHub, GitLab, Bitbucket)
to propose changes from one branch to another.
* Typically used to merge changes from a feature branch into the main branch.
* Allows team members to review, discuss, and approve changes before integrating 
them into the main branch. 

## Why is a Pull Request Done?
1. **Code Review**
    - Ensures that code is reviewed by team members to catch bugs, enforce coding
    standards, and maintain quality.
2. **Collaboration**
    - Encourages discussion around the changes, providing feedback.
3. **Version Control**
    - Keeps track of what changes are proposed, why they are needed, and who approved them.
## How a Pull Request Works with Branches? 
1. **Create a Feature Branch**
    - Create a new branch for testing login feature, to work on specicific feature testing.
2. **Make and Commit Changes**
    - Code changes that are made and committed to feature branch.
3. **Push to Remote**
    - The feature branch is pushed to the remote repository
    ```bash
    git push origin login_test 
    ```
4. **Open A Pull Request**
    - The tester opens a pull request to merge the `feature-testing` branch into the 
    main branch.
    - To do the pr, you could go to GitHub web page and open your repository, 
    GitHub will show you a button to create a **PR**.
    - PR includes:
        - Description of changes.
        - Request for reviewers.
5. **Code Review and Approval**
    - A team member review the PR, suggest changes, or approve it.
6. **Merge the PR**
    - Once the changes approved, the changes should be merged into the main branch.

### Pull Request Workflow Summary
1. Create a feature branch and commit changes.
2. Push the branch to the remote repository
3. Open a pull request to merge the feature branch into the main branch.
4. Request reviews
5. Once approved, merge the pull request to the main branch.

## What is a Git Conflict? 
- A git conflict happens when two or more changes are made to the same part of a file, and Git cannot automatically
determine which change to keep.
- Conflicts usually occur during **merging** branches.

### When do conflicts happen?
1. **Mergin Branches**
   - Example: If two branches modify the same line of code in a file and you try to merge them.
2. **Pulling Changes**
   - Example: When you pull updates from the remote and they conflict with your local changes.

## Steps to Resolve a confli
#### 1. **Identify the Conflict**
- Git will stop the operation and show a message like
```bash
CONFLICT (content): Merge conflict in <filename>
Automatic merge failed; fix conflicts and then commit the result
```
- Check files are in conflic using:
```bash
git status
```
#### 2. **Open the File to See the Conflict**
- Open the conflicting file in a text editor or IDE. You will see the conflict markers.
```
<<<<<<< HEAD
  Code from your current branch
  =======
  Code from the branch being merged
  >>>>>>> branch-name
```
- `HEAD`: Represents your branch
- `branch-name`: Represents incoming branch.

#### 3. **Resolve the Conflict**
- Decide which changes to keep:
   1. Keep the changes from your branch
   2. Keep the changes from the other branch
   3. Combine both changes manually.
   4. Remove the conflict markers after resolving. (`<<<<<<<`, `=======`, `>>>>>>>`)

#### 4. **Complete the Operation**
```bash
git add <filename>
git commit -m "Message"
```







