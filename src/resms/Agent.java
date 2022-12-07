package resms;
public class Agent
{
    String agent_name,  id,  area;

    Agent(String agent_name, String id, String area){

        this.agent_name=agent_name;
        this.area=area;
        this.id=id;
    }
    void display(){
        System.out.println(agent_name+area+id);
    }
}
