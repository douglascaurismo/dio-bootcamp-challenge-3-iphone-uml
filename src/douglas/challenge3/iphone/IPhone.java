package douglas.challenge3.iphone;

import douglas.challenge3.Browser;
import douglas.challenge3.Device;
import douglas.challenge3.MusicPlayer;
import douglas.challenge3.Phone;

public class IPhone implements Device {
    private final IPhoneMusicPlayer musicPlayer = new IPhoneMusicPlayer();
    private final IPhonePhone phone = new IPhonePhone();
    private final IPhoneBrowser browser = new IPhoneBrowser();

    @Override
    public MusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    @Override
    public Phone getPhone() {
        return phone;
    }

    @Override
    public Browser getBrowser() {
        return browser;
    }
}

