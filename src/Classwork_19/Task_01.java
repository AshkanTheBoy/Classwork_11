package Classwork_19;

import java.util.ArrayList;
import java.util.List;

/*
func interface
 */
public class Task_01 {
    public static void main(String[] args) {

        ElectricalDevice lamp = state -> {
            System.out.println(state? "On": "Off");
        };
        Button button1 = new Button(lamp);
        Button button2 = new Button(new Iron());

        button2.switchOnOff();
        Button button3 = new Button(new ElectricalDevice() {
            @Override
            public void switchOnOff(boolean state) {
                System.out.println(state? "2On": "2Off");
            }
        });
        button3.switchOnOff();
        button3.switchOnOff();

        List<ElectricalDevice> deviceList = new ArrayList<>();
        deviceList.add(new Iron());
        deviceList.add(new Iron());
        ButtonEx buttonEx = new ButtonEx(deviceList);
        buttonEx.switchOnOff();
    }
}

class Button{
    protected boolean state = false;
    private ElectricalDevice device;

    public Button(){}

    public Button(ElectricalDevice device) {
        this.device = device;
    }

    public void switchOnOff(){
        state = !state;
        if (state){
            System.out.println("On");
        } else {
            System.out.println("Off");
        }
        device.switchOnOff(state);
    }
}

@FunctionalInterface
interface ElectricalDevice{
    void switchOnOff(boolean state);
}

class Iron implements ElectricalDevice {

    @Override
    public void switchOnOff(boolean state) {
        System.out.println(state? "1On": "1Off");
    }
}

class ButtonEx extends Button{

    private List<ElectricalDevice> deviceList;

    public ButtonEx(List<ElectricalDevice>deviceList) {
        this.deviceList = deviceList;
    }

    @Override
    public void switchOnOff(){
        state = !state;
        if (state){
            System.out.println("On");
        } else {
            System.out.println("Off");
        }
        for (ElectricalDevice device: deviceList){
            device.switchOnOff(state);
        }
    }
}
