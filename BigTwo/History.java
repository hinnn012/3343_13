package BigTwo;

import java.util.ArrayList;

public class History {

	ArrayList<String> history;

	public History(ArrayList<String> history) {
		super();
		this.history = history;
	}
/*
	public History() {
		this.history = new ArrayList<String>();
	}
*/
	public ArrayList<String> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<String> history) {
		this.history = history;
	}
	
	public void printHistory(){
		if(!history.isEmpty()){
			System.out.println("History:");
			for(String s : history) {
				
				System.out.println(s);
				
			}
		}
		else{
			System.out.println("No history. ");
		}
		
	}
	
	public boolean isEmpty(){
		return history.isEmpty();
	}
	
	public void addHistory(String aHistory){
		history.add(aHistory);
	}
}
