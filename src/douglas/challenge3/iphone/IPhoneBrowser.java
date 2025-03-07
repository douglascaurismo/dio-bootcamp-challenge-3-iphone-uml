package douglas.challenge3.iphone;

import douglas.challenge3.Browser;

public class IPhoneBrowser implements Browser {
    @Override
    public void showPage(String url) {
        System.out.println("show page " + url);
    }

    @Override
    public void addTab() {
        System.out.println("add tab");
    }

    @Override
    public void reload() {
        System.out.println("reload");
    }
}
