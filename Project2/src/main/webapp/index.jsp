<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:p="http://primefaces.org/ui"
	xmlns:pe="http://primefaces.org/ui/extensions">

<h:head>
</h:head>
<h:body>
	<div class="ui-fluid">
    <p:panelGrid columns="2" columnClasses="ui-grid-col-2,ui-grid-col-10" layout="grid" styleClass="ui-panelgrid-blank">
        <p:outputLabel for="input" value="Input"/>
        <p:inputText id="input"/>
 
        <p:outputLabel for="area" value="Textarea"/>
        <p:inputTextarea id="area"/>
 
        <p:outputLabel for="calendar" value="Calendar"/>
        <p:calendar id="calendar"/>
 
       
 
        <p:outputLabel for="mask" value="Mask"/>
        <p:inputMask id="mask" mask="99/99/9999"/>
 
        <p:outputLabel for="pwd" value="Password"/>
        <p:password id="pwd" />
 
        <p:outputLabel for="keyboard" value="Keyboard"/>
        <p:keyboard id="keyboard" />
 
       
    </p:panelGrid>
    </div>
    </h:body>
</html>