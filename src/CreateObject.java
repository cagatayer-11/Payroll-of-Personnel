import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateObject {
	public void createPersonnel(String file1,String file2) throws IOException { // This my main method , in here I'm creating personnel objects and writing ".txt" files.
		ReadFile read = new ReadFile();
		String [] personnel = read.readFile(file1).split("\\r?\\n");
		String[] monitoring = read.readFile(file2).split("\\r?\\n");
		Personnel [] personnelList = new Personnel[personnel.length];
		
		for (int i = 0;i<personnel.length;i++) { // In this for loop , I create objects and then set their hours with setHours method.
				if (personnel[i].split("\t")[1].split("")[0].equals("F")) {
					personnelList[i] =   new FacultyMember(personnel[i].split("\t")[0],personnel[i].split("\t")[1],personnel[i].split("\t")[2],Integer.parseInt(personnel[i].split("\t")[3]));
					setHours(monitoring,personnelList[i]);
				}
				else if(personnel[i].split("\t")[1].split("")[0].equals("W")) {
					personnelList[i] =  new Worker(personnel[i].split("\t")[0],personnel[i].split("\t")[1],personnel[i].split("\t")[2],Integer.parseInt(personnel[i].split("\t")[3]));
					setHours(monitoring,personnelList[i]);
				}
				else if (personnel[i].split("\t")[1].split("")[0].equals("S")) {
					personnelList[i] = new Security(personnel[i].split("\t")[0],personnel[i].split("\t")[1],personnel[i].split("\t")[2],Integer.parseInt(personnel[i].split("\t")[3]));
					setHours(monitoring,personnelList[i]);
				}
				else if (personnel[i].split("\t")[1].split("")[0].equals("O")) {
					personnelList[i] = new Officer(personnel[i].split("\t")[0],personnel[i].split("\t")[1],personnel[i].split("\t")[2],Integer.parseInt(personnel[i].split("\t")[3]));
					setHours(monitoring,personnelList[i]);
				}
				else if (personnel[i].split("\t")[1].split("")[0].equals("C")) {
					personnelList[i] = new Chief(personnel[i].split("\t")[0],personnel[i].split("\t")[1],personnel[i].split("\t")[2],Integer.parseInt(personnel[i].split("\t")[3]));
					setHours(monitoring,personnelList[i]);
				}
				
				else if (personnel[i].split("\t")[1].split("")[0].equals("P")) {
					personnelList[i] = new PartTime(personnel[i].split("\t")[0],personnel[i].split("\t")[1],personnel[i].split("\t")[2],Integer.parseInt(personnel[i].split("\t")[3]));
					setHours(monitoring,personnelList[i]);
				}
				else if (personnel[i].split("\t")[1].split("")[0].equals("R")) {
					personnelList[i] = new ResearchAssistant(personnel[i].split("\t")[0],personnel[i].split("\t")[1],personnel[i].split("\t")[2],Integer.parseInt(personnel[i].split("\t")[3]));
					setHours(monitoring,personnelList[i]);
				}
			}
		
		for (Personnel p : personnelList) { // In this for loop , I write txt files with writingTxt method
				writingTxt(p);
			}
			
		}
	
	
	public static void setHours(String [] monitoring , Personnel p) { // This method for setting hours to the each personnel.
		for(int i = 0; i<monitoring.length;i++) {
			if(monitoring[i].split("\t")[0].equals(p.getRegisterNumber())) {
				 p.setWorkingHour1(Integer.parseInt(monitoring[i].split("\t")[1]));
				 p.setWorkingHour2(Integer.parseInt(monitoring[i].split("\t")[2]));
				 p.setWorkingHour3(Integer.parseInt(monitoring[i].split("\t")[3]));
				 p.setWorkingHour4(Integer.parseInt(monitoring[i].split("\t")[4]));
			}
		}
	}
	
	

	public static void writingTxt(Personnel p) {  // This method for writing txt files each personnel.
		p.calculateSalary();
		 try {
	            FileWriter writer = new FileWriter(p.getRegisterNumber()+".txt", true);
	            BufferedWriter bufferedWriter = new BufferedWriter(writer);
	            bufferedWriter.write(p.toString());
	            bufferedWriter.close();
		}
		 catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}
	
