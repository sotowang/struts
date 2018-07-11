package com.soto.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.soto.action.ProductAction;

import java.util.Date;

public class DateInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        ProductAction action = (ProductAction) actionInvocation.getAction();
        action.setDate(new Date());

        return actionInvocation.invoke();
    }
}
