package com.mrdoggy.site;

import com.mrdoggy.site.service.UserService;
import com.mrdoggy.site.service.UserServiceImpl;
import com.threewks.thundr.injection.BaseInjectionConfiguration;
import com.threewks.thundr.injection.InjectionConfiguration;
import com.threewks.thundr.injection.UpdatableInjectionContext;

public class SiteInjectionConfiguration implements InjectionConfiguration {

    @Override
    public void configure(UpdatableInjectionContext injectionContext) {
        injectionContext.inject(UserServiceImpl.class).as(UserService.class);
    }
}