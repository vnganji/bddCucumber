package Steps;

public class hooks {

	
	//hooks can be created in the same package where steps file is created
	
	//@before and //@after
	
	//it will  be executed before each scenario and after each scenario
	
	//@beforeall and @afterall
	
	//it will be executed before and after all the scenarios in the feature file
	
	//@beforestep and @afterstep
	//it will be executed before and after each step in the scenarion
	
	// if we have multiple @before or @after we can use order
	
	//ex @before(order=0) @before(order=1)
	
	//we can also add tagname in hooks
	// @before(@prod) @after(@staging)
}
