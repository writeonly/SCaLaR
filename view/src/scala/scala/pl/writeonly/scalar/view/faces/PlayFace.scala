package pl.writeonly.scalar.view.faces

import pl.writeonly.scalar.view.Face
import pl.writeonly.babel.swt.cards.PlayCard

@org.springframework.stereotype.Controller
class PlayFace extends Face {
  def apply = PlayCard(this)
}