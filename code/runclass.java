package code;

import java.util.ArrayList;
import java.util.Iterator;

public class runclass {

	
	static int numredundancyevents=0;
	static int numShadowingevents=0;
	
	public static void main(String[] args) {
		
		Rule rule= new Rule();
		ArrayList<Rule> ruleList = new ArrayList<Rule>();
		
		ruleList=rule.createRules(100);
		
		for  (Rule rulecreated : ruleList) {
			
			
		//	System.out.println(rulecreated.toString());
			
			for  (Rule rulecreated2 : ruleList) {
				
				
				//Evaluation redundancy & Shadowning
				if((rulecreated.getEvent().getEventid()==rulecreated2.getEvent().getEventid())
						&& rulecreated.getRuleid()!=rulecreated2.getRuleid() ) {
					//System.out.println("Same Event in different rules"+rulecreated.getRuleid()+" "+rulecreated2.getRuleid());
					//System.out.println(rulecreated.toString());
					//System.out.println(rulecreated2.toString());
	
					
						for(Action action1:rulecreated.getActions()) {
							
							for(Action action2:rulecreated2.getActions()) {
								int numberRepitedActions=0;
								
								if(action1.getIdAction()==action2.getIdAction()) {
									numberRepitedActions++;
									System.out.println(rulecreated.toString());
									System.out.println(rulecreated2.toString());
									System.out.println("Same Action "+action1.getIdAction()+" "+action2.getIdAction());	
								}
								
								
								if(numberRepitedActions==rulecreated.getEvent().getNumberActions()||numberRepitedActions==rulecreated2.getEvent().getNumberActions() ) {
									
									if(rulecreated.getEvent().getNumberActions()==rulecreated2.getEvent().getNumberActions()) {
										System.out.println("Redundancy event");
										numredundancyevents++;
										
									}else {
										
										System.out.println("Shawdowing event");
										numShadowingevents++;
										
									}
									
								
									
									
								}
							}
							
						}
						
						

					
					
						
				}
				
				
			}
			

			
		}
		
		System.out.println("NUmber of redundancy events"+ numredundancyevents );
		System.out.println("NUmber of shadowing events"+ numShadowingevents);
		
	}
}
