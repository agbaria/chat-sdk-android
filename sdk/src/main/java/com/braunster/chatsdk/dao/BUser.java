package com.braunster.chatsdk.dao;

import android.graphics.Bitmap;
import android.util.Base64;
import android.util.Log;

import com.braunster.chatsdk.Utils.Debug;
import com.braunster.chatsdk.Utils.ImageUtils;
import com.braunster.chatsdk.dao.core.DaoCore;
import com.braunster.chatsdk.dao.entities.BMetadataEntity;
import com.braunster.chatsdk.dao.entities.BUserEntity;
import com.braunster.chatsdk.dao.entities.Entity;
import com.braunster.chatsdk.network.BDefines;
import com.braunster.chatsdk.network.firebase.BFirebaseDefines;
import com.braunster.chatsdk.network.firebase.BPath;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.greenrobot.dao.DaoException;
import de.greenrobot.dao.Property;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS
// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table BUSER.
 */
public class BUser extends BUserEntity  {

    private Long id;
    private String entityID;
    private String authenticationId;
    private Integer AuthenticationType;
    private String messageColor;
    private Boolean dirty;
    private String name;
    private java.util.Date lastOnline;
    private java.util.Date lastUpdated;
    private Boolean Online;
    private Integer fontSize;
    private String fontName;
    private String textColor;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient BUserDao myDao;

    private List<BLinkedContact> BLinkedContacts;
    private List<BLinkedAccount> BLinkedAccounts;
    private List<BMetadata> Metadata;
    private List<BMessage> messages;
    private List<BThread> threadsCreated;
    private List<BLinkData> BLinkData;

    // KEEP FIELDS - put your custom fields here
    private static final String TAG = BUser.class.getSimpleName();
    private static final boolean DEBUG = Debug.BUser;

    private static final String USER_PREFIX = "user";
    // KEEP FIELDS END

    public BUser() {
    }

    public BUser(Long id) {
        this.id = id;
    }

    public BUser(Long id, String entityID, String authenticationId, Integer AuthenticationType, String messageColor, Boolean dirty, String name, java.util.Date lastOnline, java.util.Date lastUpdated, Boolean Online, Integer fontSize, String fontName, String textColor) {
        this.id = id;
        this.entityID = entityID;
        this.authenticationId = authenticationId;
        this.AuthenticationType = AuthenticationType;
        this.messageColor = messageColor;
        this.dirty = dirty;
        this.name = name;
        this.lastOnline = lastOnline;
        this.lastUpdated = lastUpdated;
        this.Online = Online;
        this.fontSize = fontSize;
        this.fontName = fontName;
        this.textColor = textColor;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getBUserDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public String getAuthenticationId() {
        return authenticationId;
    }

    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
    }

    public Integer getAuthenticationType() {
        return AuthenticationType;
    }

    public void setAuthenticationType(Integer AuthenticationType) {
        this.AuthenticationType = AuthenticationType;
    }

    public String getMessageColor() {
        return messageColor;
    }

    public void setMessageColor(String messageColor) {
        this.messageColor = messageColor;
    }

    public Boolean getDirty() {
        return dirty;
    }

    public void setDirty(Boolean dirty) {
        this.dirty = dirty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(java.util.Date lastOnline) {
        this.lastOnline = lastOnline;
    }

    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Boolean getOnline() {
        return Online;
    }

    public void setOnline(Boolean Online) {
        this.Online = Online;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BLinkedContact> getBLinkedContacts() {
        if (BLinkedContacts == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BLinkedContactDao targetDao = daoSession.getBLinkedContactDao();
            List<BLinkedContact> BLinkedContactsNew = targetDao._queryBUser_BLinkedContacts(id);
            synchronized (this) {
                if(BLinkedContacts == null) {
                    BLinkedContacts = BLinkedContactsNew;
                }
            }
        }
        return BLinkedContacts;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetBLinkedContacts() {
        BLinkedContacts = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BLinkedAccount> getBLinkedAccounts() {
        if (BLinkedAccounts == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BLinkedAccountDao targetDao = daoSession.getBLinkedAccountDao();
            List<BLinkedAccount> BLinkedAccountsNew = targetDao._queryBUser_BLinkedAccounts(id);
            synchronized (this) {
                if(BLinkedAccounts == null) {
                    BLinkedAccounts = BLinkedAccountsNew;
                }
            }
        }
        return BLinkedAccounts;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetBLinkedAccounts() {
        BLinkedAccounts = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BMetadata> getMetadata() {
        if (Metadata == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BMetadataDao targetDao = daoSession.getBMetadataDao();
            List<BMetadata> MetadataNew = targetDao._queryBUser_Metadata(id);
            synchronized (this) {
                if(Metadata == null) {
                    Metadata = MetadataNew;
                }
            }
        }
        return Metadata;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetMetadata() {
        Metadata = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BMessage> getMessages() {
        if (messages == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BMessageDao targetDao = daoSession.getBMessageDao();
            List<BMessage> messagesNew = targetDao._queryBUser_Messages(id);
            synchronized (this) {
                if(messages == null) {
                    messages = messagesNew;
                }
            }
        }
        return messages;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetMessages() {
        messages = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BThread> getThreadsCreated() {
        if (threadsCreated == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BThreadDao targetDao = daoSession.getBThreadDao();
            List<BThread> threadsCreatedNew = targetDao._queryBUser_ThreadsCreated(id);
            synchronized (this) {
                if(threadsCreated == null) {
                    threadsCreated = threadsCreatedNew;
                }
            }
        }
        return threadsCreated;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetThreadsCreated() {
        threadsCreated = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BLinkData> getBLinkData() {
        if (BLinkData == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BLinkDataDao targetDao = daoSession.getBLinkDataDao();
            List<BLinkData> BLinkDataNew = targetDao._queryBUser_BLinkData(id);
            synchronized (this) {
                if(BLinkData == null) {
                    BLinkData = BLinkDataNew;
                }
            }
        }
        return BLinkData;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetBLinkData() {
        BLinkData = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
 /*   @Override
    public void updateFrom(BUser bUser) {

//        Log.d("BUSER", "Update from, Facebook ID")
        if (bUser == null || bUser.equals(this))
            return;

        // ASK check if giving wanted behavior.
        if (lastUpdated != null && bUser.lastUpdated.before(lastUpdated))
            return;

        if (StringUtils.isNotEmpty(entityID))
            entityID = bUser.entityID;

        if (StringUtils.isNotEmpty(bUser.facebookID))
            facebookID = bUser.facebookID;

        if (StringUtils.isNotEmpty(bUser.name))
            name = bUser.name;

        if (StringUtils.isNotEmpty(bUser.email))
            email = bUser.email;

        if (StringUtils.isNotEmpty(bUser.pictureURL))
        {
            pictureExist = bUser.pictureExist;
            pictureURL = bUser.pictureURL;
        }

        if (bUser.hasApp)
            hasApp = bUser.hasApp;

        // ASK should i mark this user as updated after this?
    }*/

    @Override // Note Done!
    public BPath getPath() {
        return new BPath().addPathComponent(BFirebaseDefines.Path.BUsersPath, getEntityID());
    }

    @Override //Note done
    public Entity.Type getEntityType() {
        return Entity.Type.bEntityTypeUser;
    }

    @Override //Note Done!
    public void updateFromMap(Map<String, Object> map) {
        if (map.containsKey(BDefines.Keys.BAuthenticationID) && StringUtils.isNotEmpty((CharSequence) map.get(BDefines.Keys.BAuthenticationID)))
            this.authenticationId = (String) map.get(BDefines.Keys.BAuthenticationID);

        if (map.containsKey(BDefines.Keys.BOnline) && !map.get(BDefines.Keys.BOnline).equals(""))
            this.Online = (Boolean) map.get(BDefines.Keys.BOnline);

        if (map.containsKey(BDefines.Keys.BColor) && !map.get(BDefines.Keys.BColor).equals("")) {
            this.messageColor = (String) map.get(BDefines.Keys.BColor);
        }

        if (map.containsKey(BDefines.Keys.BTextColor) && !map.get(BDefines.Keys.BTextColor).equals("")) {
            this.textColor = (String) map.get(BDefines.Keys.BTextColor);
        }

        if (map.containsKey(BDefines.Keys.BFontName) && !map.get(BDefines.Keys.BFontName).equals(""))
            this.fontName = (String) map.get(BDefines.Keys.BFontName);

        if (map.containsKey(BDefines.Keys.BFontSize) && !map.get(BDefines.Keys.BFontSize).equals(""))
            this.fontSize = ((Long) map.get(BDefines.Keys.BFontSize)).intValue();

        if (map.containsKey(BDefines.Keys.BLastOnline))
        {
            long lastOn = (Long) map.get(BDefines.Keys.BLastOnline);

            // Only update the last online value if it's greater than the local value
            if (lastOnline == null || lastOn > lastOnline.getTime())
                this.lastOnline = new Date(lastOn);
        }

        lastUpdated = new Date();
    }

    @Override //Note Done!
    public Map<String, Object> asMap() {
        Map<String , Object> map = new HashMap<String, Object>();

        if (lastOnline == null)
            lastOnline = new Date();

        map.put(BDefines.Keys.BAuthenticationID, (authenticationId == null ? "Huston we have a problem" : authenticationId) );
        map.put(BDefines.Keys.BColor, messageColor);
        map.put(BDefines.Keys.BTextColor, textColor);
        map.put(BDefines.Keys.BFontName, fontName);
        map.put(BDefines.Keys.BFontSize, fontSize);
        map.put(BDefines.Keys.BLastOnline, lastOnline.getTime());

        return map;
    }

    @Override
    public Object getPriority() {
        return this.authenticationId;
    }

    public Date lastUpdated() {
        return lastUpdated;
    }

    public String[] getCacheIDs(){
        return new String[]{entityID != null ? entityID : "", authenticationId != null ? authenticationId : ""};
    }

    @Override
    public List<BThread> getThreads(){
        return getThreads(-1);
    }

    @Override
    public List<BThread> getThreads(int type){
        /* Getting the thread list by getBLinkData can be out of date so we get the data from the database*/

        List<BThread> threads = new ArrayList<BThread>();
        List<BLinkData> list =  DaoCore.fetchEntitiesWithProperty(BLinkData.class, BLinkDataDao.Properties.UserID, getId());

        if (DEBUG) Log.d(TAG, "BUser, getThreads, Amount: " + (list==null?"null":list.size()) );

        if (list == null) return null;

        BThread thread;
        boolean checkType = (type == BThread.Type.Private || type == BThread.Type.Public);
        for (BLinkData data : list)
        {
            thread = data.getBThread();
            if (thread != null)
            {
                if (!checkType)
                {
                    threads.add(data.getBThread());
                }
                else if (thread.getType() != null && type == thread.getType())
                    threads.add(thread);
            }
        }

        return threads;
    }

    @Override
    public List<BUser> getContacts() {
        /* Getting the contact list by getBLinkedContacts can be out of date so we get the data from the database*/
        List<BUser> contacts = new ArrayList<BUser>();

        List<BLinkedContact> list =  DaoCore.fetchEntitiesWithProperty(BLinkedContact.class, BLinkedContactDao.Properties.Owner, getId());

        if (DEBUG) Log.d(TAG, "BUser, getContacts, Amount: " + (list==null?"nulll":list.size()) );

        /* FIXME check if can be changed to quicker method*/
        for (BLinkedContact contact : list)
        {
            BUser user = null;

            if (contact.getEntityID() != null)
            {
                user = DaoCore.<BUser>fetchEntityWithEntityID(BUser.class, contact.getEntityID());
            }
            else if (contact.getAuthenticationId() != null)
            {
                user = DaoCore.fetchOrCreateUserWithAuthenticationID(contact.getAuthenticationId());
            }

            if (user != null)
                contacts.add(user);
        }

        // TODO order contacts by name;

        return contacts;

    }

    @Override
    public void addContact(BUser user) {
        if (DEBUG) Log.v(TAG,"Name: " + user.getMetaName());
        if (user.equals(this))
            return;

        BLinkedContact contact;

        if (user.getEntityID() != null)
            contact = DaoCore.fetchEntityWithProperties(BLinkedContact.class, new Property[]{BLinkedContactDao.Properties.Owner, BLinkedContactDao.Properties.EntityID}, getId(), user.getEntityID());
        else
            contact = DaoCore.fetchEntityWithProperties(BLinkedContact.class, new Property[]{BLinkedContactDao.Properties.Owner, BLinkedContactDao.Properties.AuthenticationId}, getId(), user.getAuthenticationId());


        boolean exist = contact != null;
/*        for (BUser contact : getContacts())
        {
            if ( contact.getEntityID() != null && contact.getEntityID().equals(user.getEntityID() )
                    || ( contact.getAuthenticationId() != null && contact.getAuthenticationId().equals(user.getAuthenticationId())) )
            {
                isAdded = true;
                break;
            }
        }*/

        if (!exist)
        {
            BLinkedContact linkedContact = new BLinkedContact();
            linkedContact.setEntityID(user.getEntityID());
            linkedContact.setAuthenticationId(user.getAuthenticationId());
            // This is the bind value between the LinkedContact to this user.
            linkedContact.setOwner(getId());
            DaoCore.createEntity(linkedContact);
        }
    }

    /** Get a link account of the user by type.
     * @return BLinkedAccount if found
     * @return null if no account found.*/
    public BLinkedAccount getAccountWithType(int type){
        for (BLinkedAccount account : getBLinkedAccounts())
        {
            if (account.getType() == type)
                return account;
        }
        return null;
    }


    /*##################################################*/
    /*Metadata Fetching*/
    @Override
    public void addMetaDataObject(BMetadata metadata) {
        if (StringUtils.isEmpty(metadata.getKey()))
            Log.d(TAG, "Metadata Key is empty");

        if (metadata.getType() == BMetadataEntity.Type.NONE)
            Log.d(TAG, "Metadata has no type");

        BMetadata m = getMetadataForKey(metadata.getKey(), metadata.getType());
        if (m == null)
        {
            m = metadata;

            // Setting the metadat owner just ot be sure it will be binded to this user.
            m.setOwnerID(getId());
        }
        else m.setValue(metadata.getValue());

        if (!getChildren().contains(m)){
            Log.d(TAG, "adding the metadata.");

            // Updating the data.
            DaoCore.updateEntity(metadata);
        }
    }

    @Override//TODO
    public Bitmap getThumnail() {
        return null;
    }

    @Override
    public void setMetaPicture(Bitmap bitmap) {
        setMetadataImage(BDefines.Keys.BPicture, bitmap);
    }

    @Override
    public void setMetaPicture(String base64) {

    }

    @Override
    public void setMetaPicture(File image) {
        setMetadataImage(BDefines.Keys.BPicture, image);
    }

    @Override
    public void setMetaPictureUrl(String imageUrl) {
        setMetadataString(BDefines.Keys.BPictureURL, imageUrl);
    }

    @Override
    public String getMetaPictureUrl() {
        return metaStringForKey(BDefines.Keys.BPictureURL);
    }

    @Override
    public String getThumbnailPictureURL() {
        return metaStringForKey(BDefines.Keys.BPictureURLThumbnail);
    }

    @Override
    public void setMetaName(String name) {
        setMetadataString(BDefines.Keys.BName, name);
    }

    @Override
    public String getMetaName() {
        return metaStringForKey(BDefines.Keys.BName);
    }

    @Override
    public void setMetaEmail(String email) {
        setMetadataString(BDefines.Keys.BEmail, email);
    }

    @Override
    public String getMetaEmail() {
        return metaStringForKey(BDefines.Keys.BEmail);
    }


    public BMetadata fetchOrCreateMetadataForKey(String key, int type){
        if (DEBUG) Log.v(TAG, "fetchOrCreateMetadataForKey, Key: " + key);
        BMetadata metadata = getMetadataForKey(key, type);

        if (metadata != null)
        {
            if (DEBUG) Log.d(TAG, "Metadata Exist");
            return metadata;
        }

        if (DEBUG) Log.d(TAG, "Creating new metadata.");
        metadata = new BMetadata();
        metadata.setKey(key);
        metadata.setType(type);
        metadata.setOwnerID(getId());

        DaoCore.createEntity(metadata);

        return metadata;
    }

    public BMetadata getMetadataForKey(String key, int type){
        if (DEBUG) Log.v(TAG, "getMetadataForKey, Key: " + key);
        // The getMetadata can be out of date.
        List<BMetadata> meta = getChildren();
        for (BMetadata data :meta)
        {
            if (data.getKey().equals(key) && data.getType() == type)
            {
                if (DEBUG) Log.d(TAG, "Found the metadata, " + data.getValue());
                return data;
            }
        }
        return null;
    }

    public String metaStringForKey(String key){
        return fetchOrCreateMetadataForKey(key, BMetadataEntity.Type.STRING).getValue();
    }

    public BMetadata setMetadataString(String key, String value){
        BMetadata meta = fetchOrCreateMetadataForKey(key, BMetadataEntity.Type.STRING);
        meta.setValue(value);

        DaoCore.updateEntity(meta);

        return meta;
    }

    public BMetadata setMetadataImage( String key, File image) {
       if (DEBUG) Log.v(TAG, "setMetaImage, FilePath: " + image.getPath());

        BMetadata metadata = fetchOrCreateMetadataForKey(key, BMetadataEntity.Type.IMAGE);

        try {
            String data = Base64.encodeToString(FileUtils.readFileToByteArray(image), Base64.DEFAULT);
            metadata.setValue(data);
            if (DEBUG) Log.v(TAG, "setMetaImage, Base64 Data Length: " + data.length());

            DaoCore.updateEntity(metadata);
        } catch (IOException e) {
            e.printStackTrace();
            if (DEBUG) Log.e(TAG, "Error encoding file");
        }

        return metadata;
    }

    public BMetadata setMetadataImage( String key, Bitmap image) {
        if (DEBUG) Log.v(TAG, "setMetaImage, Bitmap Size: " + image.getByteCount());

        BMetadata metadata = fetchOrCreateMetadataForKey(key, BMetadataEntity.Type.IMAGE);

        String data = ImageUtils.BitmapToString(image);
        metadata.setValue(data);
        if (DEBUG) Log.v(TAG, "setMetaImage, Base64 Data Length: " + data.length());

        DaoCore.updateEntity(metadata);

        return metadata;
    }

    public Bitmap metaImageForKey(String key){

        String value = fetchOrCreateMetadataForKey(key, BMetadataEntity.Type.IMAGE).getValue();

        Bitmap bitmap = null;

        if (value != null)
            bitmap = ImageUtils.decodeFrom64(value.getBytes());

        return bitmap;
    }
    /*##################################################*/

    public <T extends Entity> List<T> getChildren() {
        if (DEBUG) Log.v(TAG, "getChildren, id: " + getId());
        List<BMetadata> list =  DaoCore.fetchEntitiesWithProperty(BMetadata.class, BMetadataDao.Properties.OwnerID, getId());

        if (DEBUG) Log.d(TAG, "BUser, GetChildren, Amount: " + (list==null?"nulll":list.size()) );

        return (List<T>) list;
    }

    public boolean hasThread(BThread thread){
        com.braunster.chatsdk.dao.BLinkData data =
                DaoCore.fetchEntityWithProperties(com.braunster.chatsdk.dao.BLinkData.class,
                        new Property[]{BLinkDataDao.Properties.ThreadID, BLinkDataDao.Properties.UserID}, thread.getId(), getId());

/*
        List<BLinkData> list =  DaoCore.fetchEntitiesWithProperty(BLinkData.class, BLinkDataDao.Properties.UserID, getId());

        if (DEBUG) Log.d(TAG, "BUser, getThreads, Amount: " + (list==null?"null":list.size()) );

        if (list == null) return false;

        for (BLinkData data : list)
        {
            if (data.getBThread() != null && data.getBThread().getId().longValue() == thread.getId().longValue())
                return true;
        }
*/

        return data != null;
    }

    public String getPushChannel(){
        if (entityID == null)
            return "";

        return USER_PREFIX + (entityID.replace("-",""));
    }
    //ASK what is this.
    /*#define bUserPrefix @"user"
            #define bThumbnailSize CGSizeMake(72, 72)

    #define bListenerAddedProperty @"listener-added"*/
   /* -(void) setListenerAdded: (BOOL) listenerAdded {
        objc_setAssociatedObject(self, bListenerAddedProperty, @(listenerAdded), OBJC_ASSOCIATION_RETAIN);
    }

    -(BOOL) listenerAdded {
        return [objc_getAssociatedObject(self, bListenerAddedProperty) boolValue];
    }*/
   /* -(NSString *) pushChannel {
        return [NSString stringWithFormat:@"%@_%@", bUserPrefix, self.entityID];
    }*/

    /*-(NSString *) pushChannel {
        return [NSString stringWithFormat:@"%@_%@", bUserPrefix, self.entityID];
    }

    -(BUserAccount *) accountWithType: (bAccountType) type {
        for (BUserAccount * account in self.linkedAccounts) {
            if (account.type.intValue == type) {
                return account;
            }
        }
        return Nil;
    }*/


   /* // Make sure that any meta data that's added is valid
    -(void) addMetaDataObject:(BMetaData *)value {

        // Check to see if an object with this key already exists
        if (!value.key || !value.key.length) {
            NSLog(@"Meta data has no key!");
            return;
        }

        if (!value.type || value.type.intValue == bPropertyTypeNone) {
            NSLog(@"Meta data has no type!");
            return;
        }

        if (value.type.intValue == bPropertyTypeImage) {
            NSLog(@"Image");
        }

        // See if there's already a piece of metadata with the same key
        BMetaData * dataForKey = [self metaDataForKey:value.key type:value.type.intValue];
        if (!dataForKey) {
            dataForKey = value;
        }
        else {
            dataForKey.value = value.value;
            //NSLog(@"Meta data has same key as another piece of data");
        }

        if (![self.metaData containsObject:dataForKey]) {

            NSLog(@"Adding meta data: %@", value.entityID);

            NSMutableSet * set = [NSMutableSet setWithSet:self.metaData];
            [set addObject:dataForKey];
            self.metaData = set;
        }
    }*/
    // KEEP METHODS END

}
