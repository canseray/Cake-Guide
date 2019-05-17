package com.example.dagger_retrofit_rx_db_mvp.di.scope;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

//scope: kapsam,kapsam belirleme mekanizması saglar.kapsamlama nesne örnegini korumaya,
//ve kapsamlaştırılmış bileşenin süresi boyunca yerel tekil olarak sunmanmıza olanak tanır.
//aynı bileşenleri kullandıgımız sürece bagımlılıklarımızı bir singleton kadar saglar

//retention: tutma,açıklamalı türdeki en açıklamların ne kadar süreyle tutulacagını belirtir
//eğer tutma notu yoksa otomatik retentionpolicy.class olur

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {

}
