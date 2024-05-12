package org.example.presenter;

import org.example.model.entities.TipUtilizator;
import org.example.single_point_access.GUIFrameSinglePointAccess;
import org.example.view.*;

public class MeniuAngajatViewPresenter {
    private IMeniuAngajatView iMeniuAngajatView;
    public MeniuAngajatViewPresenter(IMeniuAngajatView iMeniuAngajatView){
        this.iMeniuAngajatView = iMeniuAngajatView;
    }
    public void CRUDCamereListener(){
        RoomsView roomsView = new RoomsView(TipUtilizator.ANGAJAT);
        GUIFrameSinglePointAccess.changePanel(roomsView.getMainPanel(), "Rooms");
    }
    public void CRUDClientiListener(){
        CrudClientiView crudClientiView = new CrudClientiView();
       GUIFrameSinglePointAccess.changePanel(crudClientiView.getJPanel(), "CRUD CLIENTI");
    }
    public void backBtnListener(){
        FirstPageView firstPageView = new FirstPageView();
        GUIFrameSinglePointAccess.changePanel(firstPageView.getMainPanel(), "First page");
    }
}
