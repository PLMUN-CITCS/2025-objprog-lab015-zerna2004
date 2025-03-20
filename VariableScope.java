public class VariableScope {
    // Declare the global variable outside of any methods
    static int globalCount = 100;

    public static void main(String[] args) {
        // Print the global variable inside the main method
        System.out.println("Global Count (from main): " + globalCount);
        
        // Call the showScope method
        showScope();
    }

    // Define the showScope method
    public static void showScope() {
        // Declare a local variable inside the showScope method
        int localCount = 50;
        
        // Print the global variable inside the showScope method
        System.out.println("Global Count (from showScope): " + globalCount);
        
        // Print the local variable inside the showScope method
        System.out.println("Local Count (from showScope): " + localCount);
    }
}
