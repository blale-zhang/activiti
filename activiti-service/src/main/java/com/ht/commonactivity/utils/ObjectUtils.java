package com.ht.commonactivity.utils;

import org.activiti.engine.delegate.Expression;
import org.activiti.engine.task.Task;

import java.util.List;
import java.util.Set;

public class ObjectUtils extends org.apache.commons.lang3.ObjectUtils{


    public static boolean isNotEmpty( List list ){
        if(null != list && list.size() > 0 )
            return true;
        return false;
    }

    public static boolean isNotEmpty( String str ){
        if( null != str &&  !"".equals(str) )
            return true;
        return false;
    }

    public static boolean isEmpty( Task task ){
            if( null == task )
                return true;
            return false;
    }

    public static boolean isNotEmpty(Expression expression){
        if( null != expression )
            return true;
        return false;
    }


    public static boolean isNotEmpty(Set<Expression> expressions){
        if( null != expressions && expressions.size() > 0 )
            return true;
        return false;
    }

}
