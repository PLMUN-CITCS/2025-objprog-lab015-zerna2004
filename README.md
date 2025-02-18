# **2025-OBJPROG-LAB015**
Week 05 - Methods in Java

Laboratory # 15 - Guided Coding Exercise 4: Variable Scope in Methods

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 15 - Guided Coding Exercise 4: Variable Scope in Methods**

   **Objective:**
   - Combine selection statements and looping constructs in an integrated application.
   - Solve a problem by classifying numbers and allowing repeated user interaction.

   **File Naming Convention:**
   - `VariableScope.java`

   **Desired Output:**
   ```txt
   Global Count (from main): 100
   Global Count (from showScope): 100
   Local Count (from showScope): 50
   ```

   **Notable Observations (to be discussed after completing the exercise):**
   - The globalCount variable, declared outside any method, can be accessed from both main and showScope.
   - The localCount variable, declared inside showScope, is only accessible within that method.

   **Java Programming Best Practices:**
   - Declare variables in the smallest scope possible. This helps prevent naming conflicts and makes your code easier to understand.
   - Use descriptive names for your variables.
      
   **Step-by-Step Instructions:**

   1. Setup Class and Main Method
      - Create a file named `VariableScope.java`.
      - Define the class `VariableScope`.
      ```Java      
      public class VariableScope {
      
      }
      ```
            
   2. Declare the Global Variable
      - Inside the class (but outside any method), add: static int globalCount = 100;
      ```Java
      public class VariableScope {
          static int globalCount = 100;
      }
      ```

   3. Start the Main Method
      - Inside the class, type public static void main(String[] args) {}
      ```Java
      public class VariableScope {
          //... (globalCount variable)...
          public static void main(String[] args) {
      
          }
      }
      ```

   4. Print globalCount in main
      - Inside main, add: System.out.println("Global Count (from main): " + globalCount);
      ```Java
      public class VariableScope {
          //... (globalCount variable)...
          public static void main(String[] args) {
              System.out.println("Global Count (from main): " + globalCount);
          }
      }
      ```

   5. Create the showScope Method (Part 1)
      - After the closing brace of main, type public static void showScope() {}
      ```Java
      public class VariableScope {
          //... (main method)...
          public static void showScope() {
      
          }
      }
      ```

   6. Create the showScope Method (Part 2)
      - Inside showScope, add:
         - int localCount = 50;
         - System.out.println("Global Count (from showScope): " + globalCount);
         - System.out.println("Local Count (from showScope): " + localCount);
      ```Java
      public class VariableScope {
          //... (main method)...
          public static void showScope() {
              int localCount = 50;
              System.out.println("Global Count (from showScope): " + globalCount);
              System.out.println("Local Count (from showScope): " + localCount);
          }
      }
      ```

   7. Call showScope in main
      - In main, add: showScope();
      ```Java
      public class VariableScope {
          public static void main(String[] args) {
              //... (other code in main)...
              showScope();
          }
          //... (showScope method)...
      }
      ```

   8. Compile and Run
       - Save the file as `VariableScope.java`.
       - Compile the code using `javac VariableScope.java` in your terminal or command prompt.
       - Run the compiled code using `java VariableScope`.

   **Conclusion**
   This exercise demonstrated the concept of variable scope in Java.  Variables have a defined scope, which determines where they can be accessed in your program.  Global variables, declared outside any method, have a broader scope than local variables, which are declared inside methods and are only accessible within those methods.  Understanding variable scope is crucial for writing well-structured and maintainable Java programs.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 05 - Laboratory # 15"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```
