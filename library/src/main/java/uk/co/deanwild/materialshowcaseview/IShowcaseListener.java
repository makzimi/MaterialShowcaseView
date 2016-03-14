package uk.co.deanwild.materialshowcaseview;


public interface IShowcaseListener {
    void onShowcaseDisplayed(MaterialShowcaseView showcaseView);
    void onShowcaseDismissed(MaterialShowcaseView showcaseView);
    void onShowcaseButtonClick(MaterialShowcaseView showcaseView);
    void onShowcaseTapIntoShape(MaterialShowcaseView showcaseView);
}
