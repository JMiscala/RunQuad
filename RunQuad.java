import java.util.Scanner;

class Quadrilateral {
    public void showDescription() {
        System.out.println("- is quadrilateral");
    }
}

class Parallelogram extends Quadrilateral {
    public void showDescription() {
        System.out.println("- has 2 pairs of parallel sides");
        super.showDescription();
    }
}

class Rectangle extends Parallelogram {
    public void showDescription() {
        System.out.println("- has 4 right angles");
        super.showDescription();
    }
}

class Square extends Rectangle {
    public void showDescription() {
        System.out.println("- has 4 equal sides");
        super.showDescription();
    }
}

class Rhombus extends Parallelogram {
    public void showDescription() {
        System.out.println("- has 4 congruent sides");
        super.showDescription();
    }
}

class Trapezoid extends Quadrilateral {
    public void showDescription() {
        System.out.println("- has 1 pair of parallel sides");
        super.showDescription();
    }
}

class RunQuad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Press R for Rectangle, S for Square, P for Parallelogram, H for Rhombus, or T for Trapezoid: ");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'R':
                Rectangle rectangle = new Rectangle();
                rectangle.showDescription();
                break;
            case 'S':
                Square square = new Square();
                square.showDescription();
                break;
            case 'P':
                Parallelogram parallelogram = new Parallelogram();
                parallelogram.showDescription();
                break;
            case 'H':
                Rhombus rhombus = new Rhombus();
                rhombus.showDescription();
                break;
            case 'T':
                Trapezoid trapezoid = new Trapezoid();
                trapezoid.showDescription();
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}