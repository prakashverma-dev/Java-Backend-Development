package com.kodewala.day20_21_Github;
/*
 * 
 * # Version Control System : We use Git to maintain the different version of our code either by own or other developers.
 * 
 * Version1 --> of program by me
 * Version2 --> of program by me
 * Version3 --> of program by my friend
 * Version4 --> of program by my devloper2
 * 
 * Version : a software running from 20 years, it would have different sofware verion, which we track on git repo by all developers who worked for that company project repo.
 * 
 * 
 * 
 * # How git works for code : - The three Areas -
 * 
 * 1. Working Directory(local files)  --> you edit file here
 * 2. Staging AREa(git add .) ---> Resides in our local system as well, ready to be push to remote.
 * 3. REPOSITORY(remote history) ---> git commit 
 * 
 * 
 * Branch - main(version 1)  ---> Initial version of Project.
 * 			saurav(version 2)  --> saurav branch
 * 			prakash(version 3)  --> prakash branch(feature-login)
 * 
 * Note : we can create as many as branch in remote server, but only one branch will run on production server.
 * 
 * public repo --> means repo is open source, anyone can contribute to it.
 * 
 * git clone ---> clone the complete repository from remote to our local system with history.
 * 
 * git init  --> Turn current local folder as Git Repository.
 * git branch -->
 * git checkout -b <branch_name>
 * 
 * git add .   --> to add all files to staging area.
 * git add >file_name>   --> to add a particular file to stating area.
 * git rm <file_name> --> to remove a particular file from stating area.
 * git status 
 * 
 * git commit -m "message"  --> ready to release to remote 
 * 
 * 
 * 
 * 
 * We have Version Control Tool : SVN, CSV, Git, Bitbucket, P4 etc..
 * 
 * Instagram Reel Example : With Reel and without reel Instagram -
 * 
 * 	Last Month > Work > code > Customer is using the application / code (100k downloaded to their phone) > without reel

	After 2 months > work > developed code which supports reel > customer started using it
 * 
 * V2.1 --> Latest Release
 * V2.2 ---> Reel features
 * V3.1 
 * 
 * Every commit gets version and version_id or commit id to track that commit.
 * 
 * Git --> Git uses to not keep our code locally. Git is version control system.
 * Github  --> Github is cloud based platform
 * push  --> local repo to remote repo
 * pull  --> remote repo to local repo.
 * Pull Request/Merge Request(PR Approved)--> move code from one branch to another branch
 * 
 * #Best Practice -
 * 
 * > git status ---> tells the difference local and remote(may added by other developer), So In order to sync local and remote we do pull first then push. 
 * 
 * 
 * 
 * 
 * 
 * 
 * ### Eclipse Project Push To Github via termainal and Setup : -
 * 
 *  Step1(First-Time Git User Only) : Setup Your Git Identity to local system/machine -

		Before making commits, you need to tell Git who you are:
		
		1. Go to Window > Preferences (or Eclipse > Settings on macOS).
		2. Navigate to Version Control (Team) > Git > Configuration.
		3. Click Add Entry... and add the following two keys:
			• Key: user.name | Value: Your Name
			• Key: user.email | Value: your.email@example.com
		4. Click Apply and Close.
		
		
	Step2 : Open Terminal In current Project or Cd <current_Project> -
	
		>git status  --
		
		>git init  --> to initlialise git local repo
		>git remote add origin <remote_project_repo_url>   --> To add remote repo to local repo.
		>git remote -v  --> to view which remote repository added in this current project.
		
			origin  https://github.com/prakashverma-dev/Java-Backend-Development (fetch)
			origin  https://github.com/prakashverma-dev/Java-Backend-Development (push)

		>git add .
		>git status
		
		>git branch -M main --> to switch to 'main' branch from 'Master' branch.
		
		>git commit -m "first commit"
		>git push origin main --> to push to remote branch
		
		
		> git pull origin main  --> TO pull some file from remote to local then add files.

	
		Note : We can Dry run,instead of final >git add . 
		
		 You can test the command without actually changing anything.
		 Add -n or --dry-run flag after git add .
		 
		>git add . -n    --> It will check what files has been successfully skiped in output preview displaying.
		
		Note : When you run >git add . -n, the output is printed directly on your terminal screen right below the command. It does not create an actual output folder or a new file.
		
		After Running we get something like this - MEANS these files will be added in final >git add . 
		
		add 'day5/other_file.txt'
		add 'day5/main.py'
		
		
		
	
 * 
 * Alt + ctrl + T --> to open terminal directly.
 * 
 * 
 * */
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
