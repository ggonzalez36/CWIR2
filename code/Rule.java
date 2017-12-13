package code;

import java.util.ArrayList;

public class Rule {
	
	int ruleid;
	ArrayList<Action> Actions;
	Event event;
	ArrayList<Rule> ruleList;
	
	

	public  ArrayList<Rule> createRules(int numberRules ) {
		
		
		
		ArrayList<Rule> ruleList = new ArrayList<Rule>();
		
		ArrayList<Integer> events = new ArrayList<Integer>();
		
		
		
		for (int i=0;i<numberRules; i++) {
			Rule rule= new Rule();
			Event event= new Event();
			ArrayList<Action> actions = new ArrayList<Action>();
			//
			
			rule.setRuleid(i);
			//
			events.add(randomWithRange(1,20));
			event.setEventid(events.get(i));
			int numberofActions=randomWithRange(1,2);
			event.setNumberActions(numberofActions);
			rule.setEvent(event);
			
			//
			
			for (int j=0;j<numberofActions; j++) {
				Action action= new Action();
				action.setIdAction(randomWithRange(1,3));
				actions.add(action);
				
			
				
			}
			rule.setActions(actions);
			
			
			//System.out.println("r"+ rule.getRuleid() +"= {e"+ events.get(i)+ "->a"+actions.get(i)+",a"+actions.get(i+1)+",a"+actions.get(i+2)+"}");
			
			
			ruleList.add(rule);
			
		}
		
		return ruleList;
	}

	
	
	


	@Override
	public String toString() {
		
		//System.out.println("r"+ rule.getRuleid() +"= {e"+ events.get(i)+ "->a"+actions.get(i)+",a"+actions.get(i+1)+",a"+actions.get(i+2)+"}");
		return "r" + ruleid + "={e" + event.eventid + "->a{" + Actions +  "}";
	}






	public ArrayList<Action> getActions() {
		return Actions;
	}






	public void setActions(ArrayList<Action> actions) {
		Actions = actions;
	}






	public ArrayList<Rule> getRuleList() {
		return ruleList;
	}






	public void setRuleList(ArrayList<Rule> ruleList) {
		this.ruleList = ruleList;
	}






	static int randomWithRange(int min, int max)
	{
	   int range = (max - min) + 1;     
	   return (int)(Math.random() * range) + min;
	}
	public int getRuleid() {
		return ruleid;
	}



	public void setRuleid(int ruleid) {
		this.ruleid = ruleid;
	}




	public Event getEvent() {
		return event;
	}



	public void setEvent(Event event) {
		this.event = event;
	}

}
