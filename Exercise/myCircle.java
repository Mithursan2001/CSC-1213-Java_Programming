public class myCircle {
    public static void main(String[] args) {
        // Create two Cylinder objects
        Cylinder cylinder1 = new Cylinder(); // Default Cylinder
        Cylinder cylinder2 = new Cylinder(2.0, 10.0, "Blue");

        // Create two Cone objects
        Cone cone1 = new Cone(); // Default Cone
        Cone cone2 = new Cone(7.0, 15.0, "Red");

        // Display details of each object
        System.out.println("Details of Cylinder 1:");
        cylinder1.display();
        System.out.println();

        System.out.println("Details of Cylinder 2:");
        cylinder2.display();
        System.out.println();

        System.out.println("Details of Cone 1:");
        cone1.display();
        System.out.println();

        System.out.println("Details of Cone 2:");
        cone2.display();
        System.out.println();

        // Modify Cone 2 and display its updated details
        cone2.setColor("Green");
        cone2.setRadius(20.0);
        System.out.println("Updated details of Cone 2:");
        cone2.display();
    }
}
