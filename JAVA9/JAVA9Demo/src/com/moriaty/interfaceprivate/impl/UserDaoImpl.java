package com.moriaty.interfaceprivate.impl;

import com.moriaty.interfaceprivate.UserDao;


/**
 * <p>
 * 接口中的私有方法
 * </p>
 *
 * @author Moriaty
 * @since 2021/7/13 17:35
 */
public class UserDaoImpl implements UserDao {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.show();
    }
}
