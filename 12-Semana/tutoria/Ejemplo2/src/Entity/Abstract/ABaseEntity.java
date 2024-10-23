package Entity.Abstract;

import Interface.CRUD;

import java.time.LocalDateTime;

public abstract class ABaseEntity implements CRUD {
    private Boolean state;
    private LocalDateTime deleteAt;

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public LocalDateTime getDeleteAt() {
        return deleteAt;
    }

    public void setDeleteAt(LocalDateTime deleteAt) {
        this.deleteAt = deleteAt;
    }
}
