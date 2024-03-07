package core.day1;

public class D01P02 
{
	public static void main(String[] args) 
	{
        MedicineInfo[] medicines = {new Tablet(), new Syrup(), new Ointment()};
        for (MedicineInfo medicine : medicines) {
            medicine.displayLabel();
        }
    }
}
