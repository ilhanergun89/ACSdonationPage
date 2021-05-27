package org.donate.cancer.testbase;

import org.donate.cancer.pages.DonationPage;

public class PageInitializer extends Base {

    public static DonationPage donationPage;

    public static void initializePageObjects() {
        donationPage = new DonationPage();
    }
}
