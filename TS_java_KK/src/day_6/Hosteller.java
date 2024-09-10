package day_6;

public class Hosteller extends Student {
	
	 int roomNumber;
	char blockName;
	String roomType;
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public char getBlockName() {
		return blockName;
	}
	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public Hosteller(int studentId, String studentName, String department, String gender, String category, double collegeFee,
			
			int roomNumber, char blockName, String roomType) {
		super(studentId, studentName, department, gender, category,collegeFee);
		  this.roomNumber = roomNumber;
	        this.blockName = blockName;
	        this.roomType = roomType;
		// TODO Auto-generated constructor stub
	}
	
	public double calculateTotalFee()
	{
		double totalamt = getCollegeFee();
		if (blockName =='a') {
			totalamt += 600000;
			if (roomType == "ac") {
				totalamt += 8000;
				}
			else if (blockName == 'b'){
				totalamt += 50000;
				if (roomType =="ac") {
					totalamt += 5000;
					 if (blockName =='c') {
						totalamt += 40000;
						if (roomType == "ac") {
							totalamt += 2500; 
						}
					}
				}
				
			}
			
			
		}return calculateTotalFee();
	}
	
	
}
