package Entity.Abtract;

import Interface.CRUD;

import java.util.List;
import java.util.Optional;

public abstract class ABaseEntity implements CRUD {
    private Long id;
    private Boolean state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}