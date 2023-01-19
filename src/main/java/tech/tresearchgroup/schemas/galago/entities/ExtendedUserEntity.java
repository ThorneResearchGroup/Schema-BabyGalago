package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import tech.tresearchgroup.dao.model.LockType;
import tech.tresearchgroup.palila.model.BasicFormObject;
import tech.tresearchgroup.palila.model.BasicUserObjectInterface;
import tech.tresearchgroup.palila.model.enums.PermissionGroupEnum;

import java.util.Date;

public class ExtendedUserEntity extends BasicFormObject implements BasicUserObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private LockType lockType;

    private PermissionGroupEnum permissionGroup;

    private String username;

    private String email;

    private String password;

    private String apiKey;
    private UserSettingsEntity userSettings;

    public ExtendedUserEntity() {
    }

    public ExtendedUserEntity(@Deserialize("created") Date created,
                              @Deserialize("updated") Date updated,
                              @Deserialize("id") Long id,
                              @Deserialize("lockType") LockType lockType,
                              @Deserialize("permissionGroup") PermissionGroupEnum permissionGroup,
                              @Deserialize("username") String username,
                              @Deserialize("email") String email,
                              @Deserialize("password") String password,
                              @Deserialize("apiKey") String apiKey,
                              @Deserialize("userSettings") UserSettingsEntity userSettings) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.lockType = lockType;
        this.permissionGroup = permissionGroup;
        this.username = username;
        this.email = email;
        this.password = password;
        this.apiKey = apiKey;
        this.userSettings = userSettings;
    }

    @Override
    @Serialize(order = 0)
    @SerializeNullable
    public Date getCreated() {
        return created;
    }

    @Override
    @Serialize(order = 1)
    @SerializeNullable
    public Date getUpdated() {
        return updated;
    }

    @Override
    @Serialize(order = 2)
    @SerializeNullable
    public Long getId() {
        return id;
    }

    @Override
    @Serialize(order = 3)
    @SerializeNullable
    public LockType getLockType() {
        return lockType;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public PermissionGroupEnum getPermissionGroup() {
        return permissionGroup;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getUsername() {
        return username;
    }

    @Serialize(order = 6)
    @SerializeNullable
    public String getEmail() {
        return email;
    }

    @Serialize(order = 7)
    @SerializeNullable
    public String getPassword() {
        return password;
    }

    @Serialize(order = 8)
    @SerializeNullable
    public String getApiKey() {
        return apiKey;
    }

    @Serialize(order = 9)
    @SerializeNullable
    public UserSettingsEntity getUserSettings() {
        return userSettings;
    }

    @Override
    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setLockType(LockType lockType) {
        this.lockType = lockType;
    }

    public void setPermissionGroup(PermissionGroupEnum permissionGroup) {
        this.permissionGroup = permissionGroup;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setUserSettings(UserSettingsEntity userSettings) {
        this.userSettings = userSettings;
    }
}
