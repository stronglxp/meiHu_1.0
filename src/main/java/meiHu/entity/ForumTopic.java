package meiHu.entity;

public class ForumTopic {
    private Integer tid;

    private String tname;

    private String tpicname;

    public String getTpicname() {
        return tpicname;
    }

    public void setTpicname(String tpicname) {
        this.tpicname = tpicname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

}