# Web only template

## spring mvc

## sitemesh

## spring i18n

Attach `?lang=en_US` or `?lang=zh_CN` to change locale.

To use messages in JSP pages we fist include spring taglib
```
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
```
and expand message by using the spring tag
```
<spring:message var="who" code="site.user"/>
<p>
Hi ${who}, welcome to <spring:message code="site.title"/>!
</p>
```

Messages are also accessible to Java code by calling the following method on
an `ApplicationContext` instance.
```
String getMessage(String code, Object[] args, Locale locale);
```
The argument `locale` can be easily obtained by `LocaleContextHolder.getLocale()`.
In order to access the spring context of our webapp any where, register a bean
that implements `ApplicationContextAware`, and save the context instance to
a static filed.


