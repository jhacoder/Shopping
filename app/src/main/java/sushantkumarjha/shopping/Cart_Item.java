package sushantkumarjha.shopping;

/**
 * Created by Sushant kumar jha on 13-05-2017.
 */

public class Cart_Item {
    String Model_Name="";
    String Company_Name="";
    String Colour="";
    String Cost="";

    public Cart_Item(){}

    public Cart_Item(String model_Name, String company_Name, String colour, String cost) {
        Model_Name = model_Name;
        Company_Name = company_Name;
        Colour = colour;
        Cost = cost;
    }

    public String getModel_Name() {
        return Model_Name;
    }

    public String getCompany_Name() {
        return Company_Name;
    }

    public String getColour() {
        return Colour;
    }

    public String getCost() {
        return Cost;
    }
}
