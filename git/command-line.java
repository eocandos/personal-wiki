# SUMMARY: WORKING

	git reset --<file> /** remove ADD*/
	git checkout --<file> /** DISCARD changes */	
	git reset <file> /** Revert commit in a file */
	git checkout <commit> /** Jump between commits */
	git checkout <commit> -- <file> /** Revert file to previous commit */
	git reset --soft HEAD~1 /** reset last COMMIT */
	git merge --abort /** cancel MERGE */

_______________________________________________________
'Create branch'
git checkout -b <branch>

_______________________________________________________
'branch local to remote'
git push -u origin <branch>

_______________________________________________________
'abort merge'
git merge --abort

_______________________________________________________

'Delete the most recent commit, keeping the work you have done:'
git reset --soft HEAD~1

'Delete the most recent commit, destroying the work you have done:'
git reset --hard HEAD~1

'This command will sync the local repository with the remote repository getting rid of every change you have made on your local.'
git reset --hard origin '(Test)'

_______________________________________________________

'Revert (reset) a single file to a specific revision:'
git checkout <commit> -- <file>
_______________________________________________________
'tmp files - ignore'
git stash 
git stash save // which enables including temporary commit message, which will help you identify changes, among with other options
git stash list // which lists all previously stashed commits (yes, there can be more) that were not poped
git stash pop // which redoes previously stashed changes and removes them from stashed list
git stash apply // which redoes previously stashed changes, but keeps them on stashed list

_______________________________________________________
'Undo a git ADD - remove files staged for a git commit'
git reset <file>

_______________________________________________________

'If you want to temporarily go back to it:'
git checkout 0d1d7fc32

'Or if you want to make commits while you"re there, go ahead and make a new branch while you"re at it:'
git checkout -b old-state 0d1d7fc32

'Undo working copy MODIFICATOINS of one file'
git checkout -- <file>

_______________________________________________________

'Show changes from commits'
git show <commit>
git show <commit> --name-only

_______________________________________________________

// Sources

- https://www.shellhacks.com/git-revert-file-to-previous-commit/
- https://github.com/joshnh/Git-Commands
- https://docs.gitlab.com/ee/topics/git/numerous_undo_possibilities_in_git/
- https://git-scm.com/docs
- https://danielkummer.github.io/git-flow-cheatsheet/