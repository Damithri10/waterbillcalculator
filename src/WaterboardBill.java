
public class WaterboardBill {
    private int billNumber;
    private int noOfUnitsUsed;
    private static double unitPrice = 3.0;

    public WaterboardBill(int billNum, int unitsUsed) {
        billNumber = billNum;
        noOfUnitsUsed = unitsUsed;
    }

    public void changeUnitPrice(double newUnitPrice) {
        unitPrice = newUnitPrice;
    }

    private double calculateFinalBillAmount() {
        double billAmount = noOfUnitsUsed * unitPrice;

        double discountAmount = 0;

        if (noOfUnitsUsed >= 200) {
            discountAmount = billAmount * 0.06;
        }
        else if (noOfUnitsUsed > 100 && noOfUnitsUsed < 199) {
            discountAmount = billAmount * 0.02;
        }

        return billAmount - discountAmount;

    }

    public void displayFinalBillAmount() {
        double finalBillAmount = calculateFinalBillAmount();
        System.out.println("Bill Number: " + billNumber);
        System.out.println("Final Bill Amount: $" + finalBillAmount);
    }
}
