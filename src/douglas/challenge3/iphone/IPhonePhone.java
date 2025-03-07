package douglas.challenge3.iphone;

import douglas.challenge3.Phone;

public class IPhonePhone implements Phone {
    @Override
    public void call(String number) {
        System.out.println("call " + number);
    }

    @Override
    public void accept() {
        System.out.println("accept");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("start voice mail");
    }
}
