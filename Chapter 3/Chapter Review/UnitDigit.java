/**
 * Write the implementation of the method whose header is shown below. The method
 * returns the units digit of a number. For example, if the number is 156, the
 * method returns 6. Use the following header:
 * public int unitsDigit(int number) {}
 *
 * @author hawyarfarooq
 */

public class UnitDigit {

    public int unitsDigit(int number) {
        return number % 10;
    }

    public static void main(String[] args) {
        UnitDigit unit = new UnitDigit();
        System.out.println(unit.unitsDigit(156));

    }
}
