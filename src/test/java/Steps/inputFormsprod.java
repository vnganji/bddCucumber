package Steps;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class inputFormsprod {
	


@Then("it displayed list of {string} user actions for production")
public void it_displayed_list_of_user_actions(String menu) {
	 System.out.println(menu+" step3 for prod ");
}



@Then("it displayed list of menu user actions")
public void parameterizatiom(List<String> data) {
	 System.out.println(data.get(0));
	 System.out.println(data.get(1));
}


@Then("enter username and password")
public void parameterizationdatablelists(DataTable table) {
	
	List<List<String>> data = table.asLists();
	 System.out.println(data.get(0).get(0));
	 System.out.println(data.get(1).get(0));
}

@Then("enter username and password as Maps")
public void parameterizationdatablemaps(DataTable table) {
	
	List<Map<String,String>> data = table.asMaps();
	 System.out.println(data.get(0).get("firstname"));
	 System.out.println(data.get(1).get("lastname"));
}

}
