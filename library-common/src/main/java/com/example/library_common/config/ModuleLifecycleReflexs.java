package com.example.library_common.config;

/**
 * 应用模块: common
 * <p>
 * 类描述: 组件生命周期初始化类的类目管理者,在这里注册需要初始化的组件,通过反射动态调用各个组件的初始化方法
 * <p>
 * Created by Downey on 2020/8/26
 * Describe:
 */
public class ModuleLifecycleReflexs {
    /** 基础库 */
    private static final String BaseInit = "com.example.common.CommonModuleInit";

    /** main组件库 */
    private static final String MainInit =
            "com.example.main.application.MainModuleInit";

    /**用户组件初始化*/
    private static final String UserInit = "com.example.user.UserModuleInit";

    public static String[] initModuleNames = {BaseInit, MainInit,UserInit};
}
