package de.mpicbg.jug;

import ij.IJ;
import ij.ImageJ;
import ij.WindowManager;
import ij.gui.ImageWindow;

import java.io.File;

import de.mpicbg.jug.pluginmods.hyperstackreg.HyperStackReg_;

/**
 *
 */

/**
 * @author jug
 */
public class TestHyperStackReg {

	public static void main( final String[] args ) {
		final String fname =
				"/Users/jug/MPI/ProjectVanNimwegen/RealDatasets/191214_xy3-hyperstack-10.tif";

		final File file = new File( fname );

		final ImageJ ij = new ImageJ();
		if ( file.exists() && file.canRead() ) {
			IJ.open( fname );
		}

		final ImageWindow win = WindowManager.getCurrentWindow();
		( ( ij.gui.StackWindow ) win ).setPosition( 4, 1, 0 );

		final String className = HyperStackReg_.class.getName();
		IJ.runPlugIn( className, null );
	}
}
