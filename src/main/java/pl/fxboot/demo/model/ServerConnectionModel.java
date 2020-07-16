package pl.fxboot.demo.model;

import pro.xstore.api.message.response.LoginResponse;
import pro.xstore.api.sync.Credentials;
import pro.xstore.api.sync.SyncAPIConnector;

public class ServerConnectionModel {

    private Long login;

    private String password;

    private SyncAPIConnector connector;

    private Credentials credentials;

    private LoginResponse loginResponse;

    public ServerConnectionModel() {
    }

    public ServerConnectionModel(Long login, String password, SyncAPIConnector connector, Credentials credentials, LoginResponse loginResponse) {
        this.login = login;
        this.password = password;
        this.connector = connector;
        this.credentials = credentials;
        this.loginResponse = loginResponse;
           }

    public Long getLogin() {
        return login;
    }

    public void setLogin(Long login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SyncAPIConnector getConnector() {
        return connector;
    }

    public void setConnector(SyncAPIConnector connector) {
        this.connector = connector;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public LoginResponse getLoginResponse() {
        return loginResponse;
    }

    public void setLoginResponse(LoginResponse loginResponse) {
        this.loginResponse = loginResponse;
    }
    }
