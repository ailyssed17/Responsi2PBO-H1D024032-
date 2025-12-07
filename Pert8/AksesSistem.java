package Responsi2PBO.Pert8;

public interface AksesSistem {

    void login(String pin);

    void logout();

    default String getRoleAkses() {
        return "Staff Biasa";
    }
}
