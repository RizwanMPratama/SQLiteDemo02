package com.poliban.sqlitedemo02.dao;

import com.poliban.sqlitedemo02.domain.Friend;

import java.util.List;

public interface FriendDao {
    void insert (Friend f);
    void update (Friend f);
    void delete (int id);
    Friend getFriendById(int id);
    List<Friend> getAllFriends();
}
