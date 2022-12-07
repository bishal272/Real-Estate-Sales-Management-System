package resms;
public class Property
{
    String location,agent_name;
    int pin_code, property_no;
    long  selling_price;
    Property(String location,String agent_name, int pin_code, int property_no,long selling_price){
        this.location=location;
        this.agent_name=agent_name;
        this.pin_code=pin_code;
        this.property_no=property_no;
        this.selling_price=selling_price;
    }

}