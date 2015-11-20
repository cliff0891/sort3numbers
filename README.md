# Sort 6 numbers using for loops, custom method calls, and now an array.
  This code is going to sort six random ranging from 0 to 9999 and the sort the six numbers in ascending order using array.


## Outline
```
// Call the sorting algorithm
// generate a set of random numbers to sort
// sort the array of numbers
// populate the array
// Test the array to see if there are duplicates.
```

## References and Literature
* Liang, Y. (2014). Introduction to Java programming: Comprehensive version (Tenth ed.). 

## Code
``` java 
import java.util.Scanner;
import java.util.Arrays;

	public class sort3numbers {
			public static void main(String[] args) {
				System.out.print("Hello class, "); 
				System.out.println("this is a sorting algorithm using arrays.");
				
				// call the sorting algorithm
				SortAlgorithm();
				}
			public static void SortAlgorithm() {

				// generate a set of random numbers to sort
				int listSize = 6;
				int[] numberArray = new int[listSize];
				numberArray = buildRandomArray(listSize);
				System.out.print("Our random array is: ( ");
				for (int i = 0; i < listSize; i++ ){
					System.out.print(numberArray[i] + " ");
				}
				System.out.println(").");
				
				
				// sort our array of numbers
				numberArray = sortOurArray(numberArray, listSize);
				System.out.print("Our sorted array is: ( ");
				for (int i = 0; i < listSize; i++ ){
					System.out.print(numberArray[i] + " ");
				}
				System.out.println(").");
				
			}
			public static int[] buildRandomArray(int listSize) {
				int[] numberArray = new int[listSize];
				// populate the array
				numberArray = populateRandomArray(numberArray, listSize);
				
				// Test the array to see if there are duplicates.
				
				return numberArray;
			}
			public static int[] populateRandomArray(int[] numberArray, int listSize) {
				
				int randomRange = listSize * 1000;
				for (int i = 0; i < listSize; i++ ){
					numberArray[i] = (int)(Math.random()*randomRange);
				}
				return numberArray;
			}
			
			public static int[] sortOurArray(int[] numberArray, int listSize) {
				
				int holder_1;
				int holder_2;
				for (int passCounter = 1; passCounter <= listSize; passCounter++ ){
					
					for (int i = 0; i < listSize-1; i++ ){
						
						holder_1 = numberArray[i];
						holder_2 = numberArray[i+1];
						
						if(holder_2 < holder_1){
							numberArray[i] = holder_2;
							numberArray[i+1] = holder_1;
							/* Remove our printing block
							System.out.print("We had a switch, the new array is: /n( ");
							
							for(int j = 0; j < listSize; j++){
								
								if (j == i){
									System.out.print(" " + numberArray[j] + " ");
								}else if (j == (i+1)){
									System.out.print(" " + numberArray[j] + " ");
								}else{
									System.out.print(numberArray[j] + "  ");
								}
							}
							System.out.println(")");
							*/
						}
						
					}
				}
				return numberArray;
			}
		}
```
## Console 
```
Hello class, this is a sorting algorithm using arrays.
Our random array is: ( 392 3091 4868 4561 5937 4608 ).
Our sorted array is: ( 392 3091 4561 4608 4868 5937 ).

```

## Command prompt

Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\User>e:

E:\>cd comsc
E:\>cd comsc>dir

11/13/2015  09:09 AM    <DIR>          sort3Numbers
11/18/2015  09:11 AM    <DIR>          beanMachine
11/18/2015  10:39 AM            14,083 Clifford Yuyun.docx
11/20/2015  09:18 AM    <DIR>          additionGameLoop
11/20/2015  02:56 PM            15,315 README-2-.md
              16 File(s)     14,885,199 bytes
              45 Dir(s)  459,601,674,240 bytes free

E:\COMSC>


E:\COMSC>cd sort3numbers

E:\COMSC\sort3Numbers>git config user.name "cliff0891"

E:\COMSC\sort3Numbers>git config user.email yuyunc@student.swosu.edu

E:\COMSC\sort3Numbers>git branch
* dev
  master

E:\COMSC\sort3Numbers>dir
 Volume in drive E is CLIFFORD YU
 Volume Serial Number is 3ED8-278E

 Directory of E:\COMSC\sort3Numbers

11/13/2015  09:09 AM    <DIR>          .
11/13/2015  09:09 AM    <DIR>          ..
11/13/2015  09:09 AM               388 .project
11/13/2015  09:09 AM    <DIR>          src
11/13/2015  09:09 AM    <DIR>          bin
11/13/2015  09:09 AM               232 .classpath
11/13/2015  09:18 AM                17 README.md
               3 File(s)            637 bytes
               4 Dir(s)  459,601,674,240 bytes free

E:\COMSC\sort3Numbers>git add .

E:\COMSC\sort3Numbers>git commit -m "commit"
[dev e8555e2] commit
 2 files changed, 91 insertions(+), 46 deletions(-)
 rewrite bin/sort3numbers.class (86%)
 rewrite src/sort3numbers.java (96%)

E:\COMSC\sort3Numbers>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': cliff0891
Password for 'https://cliff0891@github.com':
Counting objects: 6, done.
Delta compression using up to 2 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (6/6), 2.20 KiB | 0 bytes/s, done.
Total 6 (delta 1), reused 0 (delta 0)
To https://github.com/cliff0891/sort3numbers.git
   830ea13..e8555e2  dev -> dev

E:\COMSC\sort3Numbers>git branch
* dev
  master

E:\COMSC\sort3Numbers>git status
On branch dev
Your branch is up-to-date with 'origin/dev'.
nothing to commit, working directory clean

E:\COMSC\sort3Numbers>git pull
Already up-to-date.

E:\COMSC\sort3Numbers>

## Summary
The main method calls a greeting method in the print statement and also calls the SortAlgorithm method. the main method has no output and input variables. the main method has no internal variables. the SortAlgorithm method has an internal variables of array called numberArray. it	Calls the buildRandomArray method and Prints out the random numbers of arrays using for loops. The buildRandomArray method has no inputs and has output of numberArray. It has an internal variable of array called numberArray. it calls the populateRandomArray method. The populateRandomArray method has an internal variable called randomRange. it sort the arrays limiting to the specified range. the sortOurArray method has internal variables of holder1 and holder2.It prints out the randoms in ascending order using for loop.
