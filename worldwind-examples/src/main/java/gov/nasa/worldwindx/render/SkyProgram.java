/*
 * Copyright (c) 2016 United States Government as represented by the Administrator of the
 * National Aeronautics and Space Administration. All Rights Reserved.
 */

package gov.nasa.worldwindx.render;

import java.io.IOException;

import gov.nasa.worldwind.render.DrawContext;
import gov.nasa.worldwind.util.WWUtil;
import gov.nasa.worldwindx.R;

public class SkyProgram extends AtmosphereProgram {

    public SkyProgram(DrawContext dc) throws IOException {
        super(WWUtil.readResourceAsText(dc.getContext(), R.raw.gov_nasa_worldwind_skyprogram_vert),
            WWUtil.readResourceAsText(dc.getContext(), R.raw.gov_nasa_worldwind_skyprogram_frag),
            new String[]{"vertexPoint"});
    }
}
