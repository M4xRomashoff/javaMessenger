package presenter;

import model.group.AllMembers;
import view.View;

public class Presenter {
    private AllMembers allMembers;
    private View view;

    public Presenter(View view) {
        this.view = view;
        this.allMembers = new AllMembers();
    }
}
