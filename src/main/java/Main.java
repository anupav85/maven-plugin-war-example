/**
 * @(#) $Id: eRTJalopyCodeConventions.xml 1657 2007-06-12 14:55:27Z worourke $
 * Copyright (c) 2010 eResearchTechnology, Inc. All Rights Reserved.
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * DOCUMENT ME!
 *
 * @author skota Created On 16-Dec-2016
 */
public class Main extends HttpServlet {
    @Override protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("Hello from Java with Jenkins and GIT with locally modified but not pushed yet!");
    }
}