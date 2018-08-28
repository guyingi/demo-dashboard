package gu.pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="iptable")
public class Iptable {
    @Id
    @GeneratedValue
    private Integer id;

    private String nginxIp;

    private String upstreamIp;

    private Integer upstreamPort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNginxIp() {
        return nginxIp;
    }

    public void setNginxIp(String nginxIp) {
        this.nginxIp = nginxIp == null ? null : nginxIp.trim();
    }

    public String getUpstreamIp() {
        return upstreamIp;
    }

    public void setUpstreamIp(String upstreamIp) {
        this.upstreamIp = upstreamIp == null ? null : upstreamIp.trim();
    }

    public Integer getUpstreamPort() {
        return upstreamPort;
    }

    public void setUpstreamPort(Integer upstreamPort) {
        this.upstreamPort = upstreamPort;
    }
}