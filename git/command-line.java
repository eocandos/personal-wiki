
// Create branch
git checkout -b feature/ONEBANK-1478

_______________________________________________________
// tmp files - ignore
git stash
git stash list
git stash apply // back to branch

_______________________________________________________
// Undo a git add - remove files staged for a git commit
git reset filename.txt

_______________________________________________________
// Undo working copy modifications of one file
git checkout -- file

// You can also check out a particular version of a file:

git checkout v1.2.3 -- file         # tag v1.2.3
git checkout stable -- file         # stable branch
git checkout origin/master -- file  # upstream master
git checkout HEAD -- file           # the version from the most recent commit
git checkout HEAD^ -- file          # the version before the most recent commit

_______________________________________________________