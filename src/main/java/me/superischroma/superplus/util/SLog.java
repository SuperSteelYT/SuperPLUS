package me.superischroma.superplus.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SLog
{
    private static final Logger log = Logger.getLogger("Minecraft");
    public static void info(String message)
    {
        log.log(Level.INFO, "{0} {1}", new Object[]
                {
                        SBase.PREFIX, message
                });
    }
    public static void warning(String message)
    {
        log.log(Level.WARNING, "{0} {1}", new Object[]
                {
                        SBase.PREFIX, message
                });
    }
    public static void severe(String message)
    {
        log.log(Level.SEVERE, "{0} {1}", new Object[]
                {
                        SBase.PREFIX, message
                });
    }
    public static void severe(Exception ex)
    {
        severe(ex.toString());
    }
}
