// Main Class
public class VectorTest {

    public static void main(String[] args) {

        try {

            double[] a = {2,3};
            double[] b = {4,5};

            Vector v1 = new Vector(a);
            Vector v2 = new Vector(b);

            Vector sum = v1.add(v2);
            Vector diff = v1.subtract(v2);
            double dot = v1.dotProduct(v2);

            System.out.println("Addition Result:");
            sum.display();

            System.out.println("Subtraction Result:");
            diff.display();

            System.out.println("Dot Product = " + dot);

            // Example of dimension mismatch exception
            double[] c = {1,2,3};
            Vector v3 = new Vector(c);

            v1.add(v3);

        } catch(VectorException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        // Example of invalid vector dimension
        try {

            double[] d = {1,2,3,4}; // Invalid dimension
            Vector v4 = new Vector(d);

        } catch(VectorException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
