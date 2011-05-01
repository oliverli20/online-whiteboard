/*
* @author  Oleg Varaksin (ovaraksin@googlemail.com)
* $$Id$$
*/

package com.googlecode.whiteboard.converter;

import org.apache.commons.lang.StringUtils;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "com.googlecode.whiteboard.converter.PixelConverter")
public class PixelConverter implements Converter
{
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }

        try {
            return Integer.parseInt(StringUtils.removeEnd(value, "px"));
        } catch (NumberFormatException e) {
            throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Wrong value: '" + value + "'", e.getLocalizedMessage()));
        }
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return null;
        }

        return String.valueOf(value) + "px";
    }
}
